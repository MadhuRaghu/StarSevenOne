package com.jocata.star.RunStar;

import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.annotations.Listeners;

import com.jocata.star.Mis.Latest.Benchmarkrunreport;
import com.jocata.star.Mis.Latest.BenchmarksReport;
import com.jocata.star.Mis.Latest.BenchmarksRunReport2;
import com.jocata.star.Mis.Latest.CaseDetailsReport;
import com.jocata.star.Mis.Latest.RuleSummereyReport;
import com.jocata.star.Mis.Latest.UserCaseDetailsReport;
import com.jocata.star.existingfuctions.AddBenchMarkReportsChanges2;
import com.jocata.star.existingfuctions.AddruleChangesFuctionaltiy;
import com.jocata.star.existingfuctions.AdvancedAddBenchMark;
import com.jocata.star.existingfuctions.AdvancedAddBenchMark2;
import com.jocata.star.exportexcels.CustomerPeerProfile;
import com.jocata.star.exportexcels.DashboardTask;
import com.jocata.star.exportexcels.NetworkExportGraph;
import com.jocata.star.exportexcels.TrancastionRulePopUpExport;
import com.jocata.star.grid.ADDRolesModify;
import com.jocata.star.grid.GridAddReport2;
import com.jocata.star.grid.GridAddReport3;
import com.jocata.star.grid.IncludingPermissions2;
import com.jocata.star.includeexculde.AddDelete3;
import com.jocata.star.includeexculde.GridModules;
import com.jocata.star.includeexculde.GridModules2;
import com.jocata.star.includeexculde.STARModules;
import com.jocata.star.includeexculde.STARModules2;
import com.jocata.star.misreports.AddBenchMarkBenchMarkRun;
import com.jocata.star.misreports.AddBenchMarkBenchMarkRun2;
import com.jocata.star.misreports.AddReportCaseDetailsReport;
import com.jocata.star.misreports.AddReportDashboard;
import com.jocata.star.misreports.AddReportEventDetailsReport;
import com.jocata.star.misreports.AddReportRuleSummary;
import com.jocata.star.misreports.AddReportUserCaseDetailsReport;
import com.jocata.star.misreports.AddReportUserCaseDetailsReport2;
import com.jocata.star.misreports.AddReportsBenchMark;
import com.jocata.star.reportsdownload.MisReportsDownload;
import com.jocata.star.screens.CustomerDetailsProfile;
import com.jocata.star.screens.ExclusionList;
import com.jocata.star.screens.FalsePositiveManager;
import com.jocata.star.scripts.CustomerFieldsJocata2;
import com.jocata.star.scripts.NewCreateRuleJocata;
import com.jocata.star.scripts.SimpleSearchJocata;
import com.jocata.star.scripts.StarCase7Jocata;
import com.jocata.star.scripts.StarCase8Jocata;
import com.jocata.star.scripts.StarNavigationJocata;

import com.jocata.star.workflow.RiseSTR3;
import com.jocata.star.workflow.WorkFLowActionsReassign;
import com.jocata.star.workflow.WorkFLowAndDispActions;
import com.jocata.star.workflow.WorkFLowFalsePositive;
import com.jocata.star.workflow.WorkFlowActionsForWard;
import com.jocata.star.workflow.WorkFlowClose;

@Listeners(customListner.ListenerTest.class)

public class AllStarNewSevenoneAdvanced3 {
	
	//thisis 3 version

	public static void main(String[] args) {

		TestListenerAdapter tla = new TestListenerAdapter();
		TestNG testng = new TestNG();
		Class[] classes = new Class[] {

				
				//this one only
				
				// .............................StarTestScripts................................................................//
				AdvancedAddBenchMark2.class,
				//AdvancedAddBenchMark.class, 
				AdvanceSearchStar2.class,
				CustomerFieldsJocata2.class,
				NewCreateRuleJocata.class, SimpleSearchJocata.class, StarCase7Jocata.class, StarCase8Jocata.class,
				StarNavigationJocata.class,

				// ...............................WorkFlow....................................................................//

				WorkFlowClose.class, 
				WorkFLowFalsePositive.class,

				
				/* * // WorkFLowFalsePositive.class,//skipping
				 * //WorkFlowRaiseSTR.class,//skipping
				 * 
				 * 			
				 * // RiseSTR2.class,
				 * 
				 * // RiseSTR.class,
				 * 
				 * */
				 

				RiseSTR3.class,

				WorkFlowActionsForWard.class, 
				// WorkFllowActionSuggestFalsePostive.class,
				WorkFLowAndDispActions.class,
				//AddDelete3.class,
				WorkFLowActionsReassign.class, 

				// .............................................Reports.....................................................................................................//

				AddBenchMarkBenchMarkRun2.class,
				AddReportCaseDetailsReport.class, AddReportDashboard.class,
				AddReportEventDetailsReport.class, AddReportRuleSummary.class, AddReportsBenchMark.class,
				AddReportUserCaseDetailsReport2.class,
               //.........................................reportsdownload.....................................................//
				
				
				 UserCaseDetailsReport.class,
				
	    		 RuleSummereyReport.class,
	    		 CaseDetailsReport.class,
	    		 BenchmarksReport.class,
	    		 BenchmarksRunReport2.class,

				
				
				// .................................Exisiting..................................................................//

				
				AddruleChangesFuctionaltiy.class, AddBenchMarkReportsChanges2.class,

				// ......................................Screens..............................................................//

				CustomerDetailsProfile.class, ExclusionList.class, FalsePositiveManager.class,

				// ......................................ExportExcels.........................................................//

				CustomerPeerProfile.class, DashboardTask.class, NetworkExportGraph.class,
				TrancastionRulePopUpExport.class,

				// ..........................................Grid..............................................................//

				GridAddReport3.class, ADDRolesModify.class,
				
				GridModules2.class,
				
				
				//STARModules2.class
				
				
				//GridModules.class,
				//STARModules.class,
				
				//IncludingPermissions2.class,

				//............................................... Download.....................................................//

				//MisReportsDownload.class,
				
				//......................................................latest.................................................//
				
				
				
	    		 
	    		 //Benchmarkrunreport.class
				
				
				
				
				

		};
		testng.setTestClasses(classes);
		testng.addListener(tla);
		testng.run();
	}

}
